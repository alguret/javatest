package com.company;

import java.util.HashMap;
import java.util.Map;

public class Code {

    public String code;
    public String country;
    public HashMap<String, CityCode> cities;

    public Code(String code, String country, HashMap<String, CityCode> cities) {
        this.code = code;
        this.country = country;
        this.cities = cities;
    }

    public static Map<String, Code> generate() {

        Map<String, Code> map = new HashMap<String, Code>();

        HashMap<String, CityCode> uk = new HashMap<String, CityCode>();
        uk.put("462", new CityCode("462", "Chernigov"));
        uk.put("44", new CityCode("44", "Kiev"));
        map.put("380", new Code("38", "Ukraine", uk));

        HashMap<String, CityCode> rb = new HashMap<String, CityCode>();
        rb.put("29", new CityCode("29", "MTS"));
        rb.put("25", new CityCode("25", "Life"));
        rb.put("212", new CityCode("212", "Vitebsk"));

        map.put("375", new Code("375", "Belarus", rb));
        return map;
//        List<Code> list = new ArrayList<Code>();
//        list.add(new Code("93", "Afghanistan	Афганистан"));
//        list.add(new Code("355", "Albania	Албания"));
//        list.add(new Code("21", "Algeria	Алжир"));
//        list.add(new Code("684", "American Samoa	Американское Самоа"));
//        list.add(new Code("376", "Andorra	Андорра"));
//        list.add(new Code("244", "Angola	Ангола"));
//        list.add(new Code("1-264", "Anguilla	Ангуилла"));
//        list.add(new Code("1-268", "Antigua and Barbuda	Антигуа и Барбуда"));
//        list.add(new Code("54", "Argentina	Аргентина"));
//        list.add(new Code("374", "Armenia	Армения"));
//        list.add(new Code("297", "Aruba	Аруба"));
//        list.add(new Code("247", "Ascension	Асеньон"));
//        list.add(new Code("61", "Australia	Австралия"));
//        list.add(new Code("672", "Australian External Territories	Австралийские внеш. террит-и"));
//        list.add(new Code("43", "Austria	Австрия"));
//        list.add(new Code("994", "Azerbaijan	Азербайджан"));
//        list.add(new Code("351", "Azores	Азорские о-ва"));
//        list.add(new Code("1-242", "Bahamas	Багамы"));
//        list.add(new Code("973", "Bahrain	Бахрейн"));
//        list.add(new Code("880", "Bangladesh	Бангладеш"));
//        list.add(new Code("1-246", "Barbados	Барбадос"));
//        list.add(new Code("375", "Belarus	Белоруссия"));
//        list.add(new Code("32", "Belgium	Бельгия"));
//        list.add(new Code("501", "Belize	Белиз"));
//        list.add(new Code("229", "Benin	Бенин"));
//        list.add(new Code("1-441", "Bermuda	Бермудские о-ва"));
//        list.add(new Code("975", "Bhutan	Бутан"));
//        list.add(new Code("591", "Bolivia	Боливия"));
//        list.add(new Code("387", "Bosnia and Herzegovina	Босния и Герцеговина"));
//        list.add(new Code("267", "Botswana	Ботсвана"));
//        list.add(new Code("55", "Brazil	Бразилия"));
//        list.add(new Code("1-284", "British Virgin Islands	Британские Вирджинские о-ва   "));
//        list.add(new Code("673", "Brunei	Бруней"));
//        list.add(new Code("359", "Bulgaria	Болгария"));
//        list.add(new Code("226", "Burkina Faso	Буркина Фасо"));
//        list.add(new Code("257", "Burundi	Бурунди"));
//        list.add(new Code("7", "Russia	Россия"));
//        list.add(new Code("855", "Cambodia	Камбоджа"));
//        list.add(new Code("237", "Cameroon	Камерун"));
//        list.add(new Code("238", "Cape Verde	Капе Верде"));
//        list.add(new Code("1-345", "Cayman Islands	Каймановы о-ва"));
//        list.add(new Code("236", "Central African Republic	ЦАР"));
//        list.add(new Code("235", "Chad	Чад"));
//        list.add(new Code("56", "Chile	Чили"));
//        list.add(new Code("86", "China	Китай"));
//        list.add(new Code("672", "Christmas Island	Рождественсткие о-ва"));
//        list.add(new Code("672", "Cocos Islands	Кокосовые о-ва"));
//        list.add(new Code("57", "Colombia	Колумбия"));
//        list.add(new Code("269", "Comoros and Mayotte Island	Коморские о-ва"));
//        list.add(new Code("242", "Congo	Конго"));
//        list.add(new Code("243", "Democratic Republic (ex. Zaire)  	Дем. респ. Конго (бывш. Заир)"));
//        list.add(new Code("682", "Cook Islands	О-ва Кука"));
//        list.add(new Code("506", "Costa Rica	Коста Рика"));
//        list.add(new Code("385", "Croatia	Хорватия"));
//        list.add(new Code("53", "Cuba	Куба"));
//        list.add(new Code("357", "Cyprus	Кипр"));
//        list.add(new Code("420", "Czech Republic	Чехия"));
//        list.add(new Code("45", "Denmark	Дания"));
//        list.add(new Code("253", "Djibouti	Джибути"));
//        list.add(new Code("1-767", "Dominica	Доминика"));
//        list.add(new Code("1-809", "Dominican Republic	Доминиканская республика"));
//        list.add(new Code("62", "East Timor	Восточный Тимор"));
//        list.add(new Code("593", "Ecuador	Эквадор"));
//        list.add(new Code("20", "Egypt	Египет"));
//        list.add(new Code("503", "El Salvador	Сальвадор"));
//        list.add(new Code("240", "Equatorial Guinea	Экваториальная Гвинея"));
//        list.add(new Code("291", "Eritrea	Эритрия"));
//        list.add(new Code("372", "Estonia	Эстония"));
//        list.add(new Code("251", "Ethiopia	Эфиопия"));
//        list.add(new Code("500", "Falkland Islands	Фолклендские о-ва"));
//        list.add(new Code("679", "Fiji	Фиджи"));
//        list.add(new Code("358", "Finland	Финляндия"));
//        list.add(new Code("33", "France	Франция"));
//        list.add(new Code("590", "French Antilles	Французские Антиллы"));
//        list.add(new Code("594", "French Guiana	Французская Гвиана"));
//        list.add(new Code("689", "French Polynesia	Французская полинезия"));
//        list.add(new Code("241", "Gabonese Republic	Габон"));
//        list.add(new Code("220", "Gambia	Гамбия"));
//        list.add(new Code("995", "Georgia	Грузия"));
//        list.add(new Code("49", "Germany	Германия"));
//        list.add(new Code("233", "Ghana	Гана"));
//        list.add(new Code("350", "Gibraltar	Гибралтар"));
//        list.add(new Code("30", "Greece	Греция"));
//        list.add(new Code("299", "Greenland	Гренландия"));
//        list.add(new Code("1-473", "Grenada	Гренада"));
//        list.add(new Code("671", "Guam	Гуам"));
//        list.add(new Code("502", "Guatemala	Гватемала"));
//        list.add(new Code("224", "Guinea	Гвинея"));
//        list.add(new Code("245", "Guinea-Bissau	Гвинея Биссау"));
//        list.add(new Code("592", "Guyana	Гайана"));
//        list.add(new Code("509", "Haiti	Гаити"));
//        list.add(new Code("504", "Honduras	Гондурас"));
//        list.add(new Code("852", "Hong Kong	Гонконг"));
//        list.add(new Code("36", "Hungary	Венгрия"));
//        list.add(new Code("354", "Iceland	Исландия"));
//        list.add(new Code("91", "India	Индия"));
//        list.add(new Code("62", "Indonesia	Индонезия"));
//        list.add(new Code("98", "Iran	Иран"));
//        list.add(new Code("964", "Iraq	Ирак"));
//        list.add(new Code("353", "Irish Republic	Ирландия"));
//        list.add(new Code("972", "Israel	Израиль"));
//        list.add(new Code("39", "Italy	Италия"));
//        list.add(new Code("225", "Ivory Coast	Берег слоновой кости"));
//        list.add(new Code("1-876", "Jamaica	Ямайка"));
//        list.add(new Code("81", "Japan	Япония"));
//        list.add(new Code("962", "Jordan	Иордания"));
//        list.add(new Code("7", "Kazakhstan	Казахстан"));
//        list.add(new Code("254", "Kenya	Кения"));
//        list.add(new Code("686", "Kiribati Republic	Кирибати"));
//        list.add(new Code("850", "Korea, Dem. People's Republic	Северная Корея"));
//        list.add(new Code("82", "Korea, Republic	Южная Корея"));
//        list.add(new Code("965", "Kuwait	Кувейт"));
//        list.add(new Code("996", "Kyrgyzstan	Киргизстан"));
//        list.add(new Code("856", "Laos	Лаос"));
//        list.add(new Code("371", "Latvia	Латвия"));
//        list.add(new Code("961", "Lebanon	Ливан"));
//        list.add(new Code("266", "Lesotho	Лессото"));
//        list.add(new Code("231", "Liberia	Либерия"));
//        list.add(new Code("21", "Libya	Ливия"));
//        list.add(new Code("41", "Liechtenstein	Лихтенштейн"));
//        list.add(new Code("370", "Lithuania	Литва"));
//        list.add(new Code("352", "Luxembourg	Люксембург"));
//        list.add(new Code("853", "Macau	Макао"));
//        list.add(new Code("389", "Macedonia	Македония"));
//        list.add(new Code("261", "Madagascar	Мадагаскар"));
//        list.add(new Code("265", "Malawi	Малави"));
//        list.add(new Code("60", "Malaysia	Малайзия"));
//        list.add(new Code("960", "Maldives	Мальдивские о-ва"));
//        list.add(new Code("223", "Mali	Мали"));
//        list.add(new Code("356", "Malta	Мальта"));
//        list.add(new Code("692", "Marshall Islands	Маршалловы о-ва"));
//        list.add(new Code("596", "Martinique	Мартиника"));
//        list.add(new Code("222", "Mauritania	Мавритания"));
//        list.add(new Code("230", "Mauritius	Маврикий"));
//        list.add(new Code("52", "Mexico	Мексика"));
//        list.add(new Code("691", "Micronesia	Микронезия"));
//        list.add(new Code("377", "Monaco	Монако"));
//        list.add(new Code("976", "Mongolia	Монголия"));
//        list.add(new Code("212", "Morocco	Марокко"));
//        list.add(new Code("258", "Mozambique	Мозамбик"));
//        list.add(new Code("264", "Namibia	Намибия"));
//        list.add(new Code("674", "Nauru	Науру"));
//        list.add(new Code("977", "Nepal	Непал"));
//        list.add(new Code("31", "Netherlands	Нидерланды"));
//        list.add(new Code("599", "Netherlands Antilles	Нидерландские Антиллы"));
//        list.add(new Code("687", "New Caledonia	Новая Каледония"));
//        list.add(new Code("64", "New Zealand	Новая Зеландия"));
//        list.add(new Code("505", "Nicaragua	Никарагуа"));
//        list.add(new Code("227", "Niger	Нигер"));
//        list.add(new Code("234", "Nigeria	Нигерия"));
//        list.add(new Code("672", "Norfolk Island	Норфолкские о-ва"));
//        list.add(new Code("670", "Northern Mariana Islands	Северо-Марианские о-ва"));
//        list.add(new Code("47", "Norway	Норвегия"));
//        list.add(new Code("968", "Oman	Оман"));
//        list.add(new Code("92", "Pakistan	Пакистан"));
//        list.add(new Code("680", "Palau	Палау"));
//        list.add(new Code("507", "Panama	Панама"));
//        list.add(new Code("675", "Papua New Guinea	Папуа Новая Гвинея"));
//        list.add(new Code("595", "Paraguay	Парагвай"));
//        list.add(new Code("51", "Peru	Перу"));
//        list.add(new Code("63", "Philippines	Филипины"));
//        list.add(new Code("48", "Poland	Польша"));
//        list.add(new Code("351", "Portugal	Португалия"));
//        list.add(new Code("1-787", "Puerto Rico	Пуэрто Рико"));
//        list.add(new Code("974", "Qatar	Катар"));
//        list.add(new Code("378", "Republic of San Marino	Сан Марино"));
//        list.add(new Code("262", "Reunion Islands	Реюнион"));
//        list.add(new Code("40", "Romania	Румыния"));
//        list.add(new Code("7", "Russia	Россия"));
//        list.add(new Code("250", "Rwandese Republic	Руанда"));
//        list.add(new Code("247", "Saint Helena and Ascension Island	О-ва Святой Елены"));
//        list.add(new Code("508", "Saint Pierre et Miquelon	Сент Пьер"));
//        list.add(new Code("39", "San Marino	Сан Марино"));
//        list.add(new Code("966", "Saudi Arabia	Саудовская Аравия"));
//        list.add(new Code("221", "Senegal	Сенегал"));
//        list.add(new Code("232", "Sierra Leone	Сьерра Леоне"));
//        list.add(new Code("65", "Singapore	Сингапур"));
//        list.add(new Code("421", "Slovak Republic	Словакия"));
//        list.add(new Code("386", "Slovenia	Словения"));
//        list.add(new Code("677", "Solomon Islands	Соломоновы о-ва"));
//        list.add(new Code("252", "Somalia	Сомали"));
//        list.add(new Code("27", "South Africa	ЮАР"));
//        list.add(new Code("34", "Spain	Испания"));
//        list.add(new Code("94", "Sri Lanka	Шри Ланка"));
//        list.add(new Code("1-869", "St. Kitts and Nevis	Сент-Китс и Невис"));
//        list.add(new Code("1-758", "St. Lucia	Санта Лючия"));
//        list.add(new Code("1-784", "St. Vincent and the Grenadines	Сент Винцент и Гренадины"));
//        list.add(new Code("249", "Sudan	Судан"));
//        list.add(new Code("597", "Suriname	Суринам"));
//        list.add(new Code("268", "Swaziland	Свазиленд"));
//        list.add(new Code("46", "Sweden	Швеция"));
//        list.add(new Code("41", "Switzerland	Швейцария"));
//        list.add(new Code("963", "Syria	Сирия"));
//        list.add(new Code("886", "Taiwan	Тайвань"));
//        list.add(new Code("992", "Tajikistan	Таджикистан"));
//        list.add(new Code("255", "Tanzania	Танзания"));
//        list.add(new Code("66", "Thailand	Тайланд"));
//        list.add(new Code("228", "Togolese Republic	Тоголезе"));
//        list.add(new Code("676", "Tonga	Тонго"));
//        list.add(new Code("1-868", "Trinidad and Tobago	Тринидад и Тобаго"));
//        list.add(new Code("21", "Tunisia	Тунис"));
//        list.add(new Code("90", "Turkey	Турция"));
//        list.add(new Code("993", "Turkmenistan	Туркменистан"));
//        list.add(new Code("1-649", "Turks & Caicos Islands	 "));
//        list.add(new Code("688", "Tuvalu	Тувалу"));
//        list.add(new Code("256", "Uganda	Уганда"));
//        list.add(new Code("380", "Ukraine	Украина"));
//        list.add(new Code("971", "United Arab Emirates	ОАЭ"));
//        list.add(new Code("44", "United Kingdom	Великобритания"));
//        list.add(new Code("598", "Uruguay	Уругвай"));
//        list.add(new Code("1-340", "US Virgin Islands	Вирджинские о-ва"));
//        list.add(new Code("1", "USА	США"));
//        list.add(new Code("998", "Uzbekistan	Узбекистан"));
//        list.add(new Code("39", "Vatican City State	Ватикан"));
//        list.add(new Code("58", "Venezuela	Венесуэла"));
//        list.add(new Code("84", "Vietnam	Вьетнам"));
//        list.add(new Code("21", "Western Sahara	Западная Сахара"));
//        list.add(new Code("685", "Western Samoa	Западное Самоа"));
//        list.add(new Code("967", "Yemen, North	Северный Йемен"));
//        list.add(new Code("969", "Yemen, South	Южный Йемен"));
//        list.add(new Code("381", "Yugoslavia	Югославия"));
//        list.add(new Code("243", "Zaire	Заир"));
//        list.add(new Code("260", "Zambia	Замбия"));
//        list.add(new Code("259", "Zanzibar	Занзибар"));
//        list.add(new Code("263", "Zimbabwe	Зимбабве"));
//
//        return list;
    }
}
