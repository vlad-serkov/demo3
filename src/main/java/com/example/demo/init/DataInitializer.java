package com.example.demo.init;

import com.example.demo.dtos.BrandDTO;
import com.example.demo.dtos.ModelDTO;
import com.example.demo.dtos.OfferDTO;
import com.example.demo.dtos.UserDTO;
import com.example.demo.entity.Brand;
import com.example.demo.entity.Model;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.enums.Category;
import com.example.demo.enums.Engine;
import com.example.demo.enums.Role;
import com.example.demo.enums.Transmission;
import com.example.demo.service.*;
import com.example.demo.service.impl.UserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;


@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ModelService modelService;
    @Autowired
    private UserService userService;
    @Autowired
    private OfferService offerService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private ReportService reportService;
    @Autowired
    private UserRoleServiceImpl userRoleService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {

        BrandDTO brand = new BrandDTO(null,"Kia",
                LocalDate.now(),
                LocalDate.now());

        Brand brand1 = brandService.saveBrand(brand);
        ModelDTO hyndai = new ModelDTO( "Hyndai",
                Category.BUS,
                "1.jpg",
                2005,
                2010,
                brand1
        );

        Model model = modelService.saveModel(hyndai);

        UserRole userRole = new UserRole(Role.ADMIN);
        userRoleService.saveUserRole(userRole);

        UserDTO userDto1 = new UserDTO(
                "Vladuss_1337",
                "123456",
                "Влад",
                "Михалков",
                true,
                userRole,
                "https://2.jpg"
        );

        User user = userService.save(userDto1);

        OfferDTO offerDto1 = new OfferDTO(
                "some news",
                Engine.GASOLINE,
                "https://3.jpg",
                200000,
                2000.0,
                Transmission.MANUAL,
                2023,
                model,
                user
        );

        offerService.saveOffer(offerDto1);
        System.out.println(reportService.getReportByModelName("Hyndai"));
        reportService.getReportByModelName("Hyndai");

    }
}
