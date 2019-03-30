import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Country {


    public boolean Test(List<CountryName> test) {

        Comparator<CountryName> comparator = new Comparator<CountryName>() {
            @Override
            public int compare(CountryName o1, CountryName o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        };
        Collections.sort(test,comparator);
        for(CountryName countryName:test) {
            System.out.println(countryName.getCountryName());
        }

        CountryName countryName = new CountryName("CountryA");
        if(test.contains(countryName)) {
            return false;
        }
        return true;
    }




    public static class CountryName {
        String countryName;

        CountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryName() {
            return countryName;
        }

        @Override
        public boolean equals(Object a) {
            CountryName countryName = (CountryName) a;
            String comp = countryName.getCountryName();
            return comp.equals(this.getCountryName());
        }

//        @Override
//        public int hashCode() {
//            return countryName.hashCode();
//        }

    }

    public static void main(String[] args) {
        CountryName countryNameC = new CountryName("CountryC");
        CountryName countryNameB = new CountryName("CountryB");
        CountryName countryNameA = new CountryName("CountryA");
        Country country = new Country();
        List<CountryName> countryNames = new ArrayList<>();
        countryNames.add(countryNameC);
        countryNames.add(countryNameB);
        countryNames.add(countryNameA);
        System.out.println(country.Test(countryNames));
    }


}
