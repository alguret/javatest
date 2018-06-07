package com.company;

import java.util.Map;
import java.util.regex.Matcher;

public class UserNumber {

    private String number;
    private Code country;
    private CityCode city;

    private static final short TYPE_MOBILE = 1;
    private static final short TYPE_FIXED = 2;

    public UserNumber(String number, Matcher m) {
        this.number = number;
        Map<String, Code> map = Code.generate();
        this.country = map.get(m.group(1));
        this.city = map.get(m.group(1)).cities.get(m.group(2));
    }

    public String getNumber() {
        return number;
    }

    public String getCountry() {
        return this.country.country;
    }

    public String getCity() {
        return this.city.cityName;
    }
}