package com.free.user.router;

import com.free.user.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UserInfoRouter {

    @Bean
    public RouterFunction<ServerResponse> routeUserInfo(UserHandler userHandler) {
        return RouterFunctions.route(RequestPredicates.POST("/user")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), userHandler::getUserInfo);

    }

}

