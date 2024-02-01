package com.polarbookshop.edgeservice.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@RestController
public class WebEndpoints {
    @GetMapping("/catalog-fallback")
    public Mono<String> getFallback(){
        return Mono.just("");
    }

    @PostMapping("/catalog-fallback")
    public HttpStatus postFallback(){
        return HttpStatus.SERVICE_UNAVAILABLE;
    }
//    public RouterFunction<ServerResponse> routerFunction() {
//        return RouterFunctions.route()
//                .GET("/catalog-fallback", request -> ServerResponse.ok().body(Mono.just(""), String.class))
//                .POST("/catalog-fallback", request -> ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE).build())
//                .build();
//    }
}
