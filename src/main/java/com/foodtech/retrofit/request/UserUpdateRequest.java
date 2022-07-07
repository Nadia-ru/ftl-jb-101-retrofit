package com.foodtech.retrofit.request;

import com.foodtech.retrofit.response.UserResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserUpdateRequest {
    @Getter
    @Setter
    @Builder
    public static class Address{
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private UserUpdateRequest.Geo geo;
    }

    @Getter
    @Setter
    @Builder
    public static class Company{
        private String name;
        private String catchPhrase;
        private String bs;
    }

    @Getter
    @Setter
    @Builder
    public static class Geo{
        private String lat;
        private String lng;
    }
    private int id;
    private String name;
    private String username;
    private String email;
    private UserUpdateRequest.Address address;
    private String phone;
    private String website;
    private UserUpdateRequest.Company company;
}
