package com.free.user.handler;

import com.free.user.vo.UserInfoVO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    public Mono<ServerResponse> getUserInfo(ServerRequest request){

        UserInfoVO vo = new UserInfoVO();
        vo.setUserId(111L);
        vo.setUserName("xxx");
        vo.setMobile("1111111111");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(vo));
    }
}
