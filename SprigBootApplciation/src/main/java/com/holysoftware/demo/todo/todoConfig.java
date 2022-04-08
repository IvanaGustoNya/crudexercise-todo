//package com.holysoftware.demo.todo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.CommandLineRunner;
//
//import java.util.List;
//
//@Configuration
//public class todoConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            todoRepo repository){
//        return args -> {
//           todo user1 =  new todo(
//                    "JLO",
//                    "commoner",
//                    "Tommorow"
//
//            );
//            todo user2 =  new todo(
//
//                    "JLO",
//                    "commoner",
//                    "Tommorow"
//
//            );
//            repository.saveAll(
//                    List.of(user1, user2)
//
//            );
//
//        };
//    }
//}
