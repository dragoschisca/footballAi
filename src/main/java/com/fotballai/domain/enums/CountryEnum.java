package com.fotballai.domain.enums;

import java.util.Arrays;
import java.util.Optional;

public enum CountryEnum {
    ARGENTINA(1, "CONMEBOL", "AR", "ARG", "Argentina"),
    SPAIN(2, "UEFA", "ES", "ESP", "Spain"),
    FRANCE(3, "UEFA", "FR", "FRA", "France"),
    ENGLAND(4, "UEFA", "GB", "GBR", "United Kingdom"),
    PORTUGAL(5, "UEFA", "PT", "PRT", "Portugal"),
    BRAZIL(6, "CONMEBOL", "BR", "BRA", "Brazil"),
    MAROCCO(7, "CAF", "MA", "MAR", "Morocco"),
    NETHERLANDS(8, "UEFA", "NL", "NLD", "Netherlands"),
    BELGIUM(9, "UEFA", "BE", "BEL", "Belgium"),
    GERMANY(10, "UEFA", "DE", "DEU", "Germany"),
    CROATIA(11, "UEFA", "HR", "HRV", "Croatia"),
    ITALY(12, "UEFA", "IT", "ITA", "Italy"),
    COLOMBIA(13, "CONMEBOL", "CO", "COL", "Colombia"),
    MEXICO(14, "CONCONCAF", "MX", "MEX", "Mexico"),
    SENEGAL(15, "CAF", "SN", "SEN", "Senegal"),
    URUGUAY(16, "CONMEBOL", "UY", "URY", "Uruguay"),
    UNITED_STATES(17, "CONCONCAF", "US", "USA", "United States"),
    JAPAN(18, "AFC", "JP", "JPN", "Japan"),
    SWITZERLAND(19, "UEFA", "CH", "CHE", "Switzerland"),
    IRAN(20, "AFC", "IR", "IRN", "Iran"),
    DENMARK(21, "UEFA", "DK", "DNK", "Denmark"),
    TURKEY(22, "UEFA", "TR", "TUR", "Turkey"),
    ECUADOR(23, "CONMEBOL", "EC", "ECU", "Ecuador"),
    AUSTRIA(24, "UEFA", "AT", "AUT", "Austria"),
    SOUTH_KOREA(25, "AFC", "KR", "KOR", "South Korea"),
    NIGERIA(26, "CAF", "NG", "NGA", "Nigeria"),
    AUSTRALIA(27, "AFC", "AU", "AUS", "Australia"),
    ALGERIA(28, "CAF", "DZ", "DZA", "Algeria"),
    EGYPT(29, "CAF", "EG", "EGY", "Egypt"),
    CANADA(30, "CONCONCAF", "CA", "CAN", "Canada"),
    NORWAY(31, "UEFA", "NO", "NOR", "Norway"),
    UKRAINE(32, "UEFA", "UA", "UKR", "Ukraine"),
    COTE_D_IVOIRE(33, "CAF", "CI", "CIV", "Côte d'Ivoire"),
    PANAMA(34, "CONCONCAF", "PA", "PAN", "Panama"),
    RUSSIA(35, "UEFA", "RU", "RUS", "Russia"),
    POLAND(36, "UEFA", "PL", "POL", "Poland"),
    WALES(37, "UEFA", "GB", "WLS", "Wales"),
    SWEDEN(38, "UEFA", "SE", "SWE", "Sweden"),
    HUNGARY(39, "UEFA", "HU", "HUN", "Hungary"),
    CZECHIA(40, "UEFA", "CZ", "CZE", "Czechia"),
    PARAGUAY(41, "CONMEBOL", "PY", "PRY", "Paraguay"),
    SCOTLAND(42, "UEFA", "GB", "SCT", "Scotland"),
    SERBIA(43, "UEFA", "RS", "SRB", "Serbia"),
    CAMEROON(44, "CAF", "CM", "CMR", "Cameroon"),
    TUNISIA(45, "CAF", "TN", "TUN", "Tunisia"),
    DR_CONGO(46, "CAF", "CD", "COD", "DR Congo"),
    SLOVAKIA(47, "UEFA", "SK", "SVK", "Slovakia"),
    GREECE(48, "UEFA", "GR", "GRC", "Greece"),
    VENEZUELA(49, "CONMEBOL", "VE", "VEN", "Venezuela"),
    UZBEKISTAN(50, "AFC", "UZ", "UZB", "Uzbekistan"),
    CHILE(51, "CONMEBOL", "CL", "CHL", "Chile"),
    PERU(52, "CONMEBOL", "PE", "PER", "Peru"),
    COSTA_RICA(53, "CONCONCAF", "CR", "CRI", "Costa Rica"),
    ROMANIA(54, "UEFA", "RO", "ROU", "Romania"),
    MALI(55, "CAF", "ML", "MLI", "Mali"),
    QATAR(56, "AFC", "QA", "QAT", "Qatar"),
    IRAQ(57, "AFC", "IQ", "IRQ", "Iraq"),
    REPUBLIC_OF_IRELAND(58, "UEFA", "IE", "IRL", "Republic of Ireland"),
    SLOVENIA(59, "UEFA", "SI", "SVN", "Slovenia"),
    SOUTH_AFRICA(60, "CAF", "ZA", "ZAF", "South Africa"),
    SAUDI_ARABIA(61, "AFC", "SA", "SAU", "Saudi Arabia"),
    BURKINA_FASO(62, "CAF", "BF", "BFA", "Burkina Faso"),
    JORDAN(63, "AFC", "JO", "JOR", "Jordan"),
    BOSNIA_AND_HERZEGOVINA(64, "UEFA", "BA", "BIH", "Bosnia & Herzegovina"),
    HONDURAS(65, "CONCONCAF", "HN", "HND", "Honduras"),
    ALBANIA(66, "UEFA", "AL", "ALB", "Albania"),
    CAPE_VERDE(67, "CAF", "CV", "CPV", "Cape Verde"),
    UNITED_ARAB_EMIRATES(68, "AFC", "AE", "ARE", "United Arab Emirates"),
    NORTH_MACEDONIA(69, "UEFA", "MK", "MKD", "North Macedonia"),
    NORTHERN_IRELAND(70, "UEFA", "GB", "NIR", "Northern Ireland"),
    JAMAICA(71, "CONCONCAF", "JM", "JAM", "Jamaica"),
    GEORGIA(72, "UEFA", "GE", "GEO", "Georgia"),
    GHANA(73, "CAF", "GH", "GHA", "Ghana"),
    ICELAND(74, "UEFA", "IS", "ISL", "Iceland"),
    FINLAND(75, "UEFA", "FI", "FIN", "Finland"),
    ISRAEL(76, "UEFA", "IL", "ISR", "Israel"),
    BOLIVIA(77, "CONMEBOL", "BO", "BOL", "Bolivia"),
    KOSOVO(78, "UEFA", "XK", "XKX", "Kosovo"),
    OMAN(79, "AFC", "OM", "OMN", "Oman"),
    MONTENEGRO(80, "UEFA", "ME", "MNE", "Montenegro"),
    GUINEA(81, "CAF", "GN", "GIN", "Guinea"),
    CURACAO(82, "CONCONCAF", "CW", "CUW", "Curacao"),
    HAITI(83, "CONCONCAF", "HT", "HTI", "Haiti"),
    SYRIA(84, "AFC", "SY", "SYR", "Syria"),
    NEW_ZEALAND(85, "OFC", "NZ", "NZL", "New Zealand"),
    GABON(86, "CAF", "GA", "GAB", "Gabon"),
    BULGARIA(87, "UEFA", "BG", "BGR", "Bulgaria"),
    ANGOLA(88, "CAF", "AO", "AGO", "Angola"),
    UGANDA(89, "CAF", "UG", "UGA", "Uganda"),
    ZAMBIA(90, "CAF", "ZM", "ZMB", "Zambia"),
    CHINA(91, "AFC", "CN", "CHN", "China"),
    BAHRAIN(92, "AFC", "BH", "BHR", "Bahrain"),
    BENIN(93, "CAF", "BJ", "BEN", "Benin"),
    THAILAND(94, "AFC", "TH", "THA", "Thailand"),
    PALESTINE(95, "AFC", "PS", "PSE", "Palestine"),
    BELARUS(96, "UEFA", "BY", "BLR", "Belarus"),
    GUATEMALA(97, "CONCONCAF", "GT", "GTM", "Guatemala"),
    LUXEMBOURG(98, "UEFA", "LU", "LUX", "Luxembourg"),
    VIETNAM(99, "AFC", "VN", "VNM", "Vietnam"),
    EL_SALVADOR(100, "CONCONCAF", "SV", "SLV", "El Salvador"),

    MOLDOVA(159, "UEFA", "MD", "MDA", "Moldova");

    private final int fifaRank;
    private final String confederation;
    private final String alpha2;
    private final String alpha3;
    private final String displayName;

    CountryEnum(int fifaRank, String confederation, String alpha2, String alpha3, String displayName) {
        this.fifaRank = fifaRank;
        this.confederation = confederation;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.displayName = displayName;
    }

    public int getFifaRank() { return fifaRank; }
    public String getConfederation() { return confederation; }
    public String getAlpha2() { return alpha2; }
    public String getAlpha3() { return alpha3; }
    public String getDisplayName() { return displayName; }

    /**
     * Finds a country cleanly by its ISO-2 or ISO-3 character code.
     */
    public static Optional<CountryEnum> findByCode(String code) {
        if (code == null) return Optional.empty();
        return Arrays.stream(values())
                .filter(c -> c.alpha2.equalsIgnoreCase(code) || c.alpha3.equalsIgnoreCase(code))
                .findFirst();
    }
}