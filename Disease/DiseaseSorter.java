package Disease;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

    public static void main(String[] args) {
        Disease cholera = new Disease("cholera",true,true);
        Disease dengue = new Disease("dengue", true, false);
        Disease malaria = new Disease("malaria", true, false);
        Disease typhoid = new Disease("typhoid", true, false);
        Disease pneumonia = new Disease("pneumonia", true, false);
        Disease arithritis = new Disease("arithritis", true, false);
        Disease cancer = new Disease("cancer", false, false);


        ArrayList<Disease> diseases = new ArrayList<Disease>();
        diseases.add(cholera);
        diseases.add(malaria);
        diseases.add(dengue);
        diseases.add(typhoid);
        diseases.add(cancer);
        diseases.add(arithritis);
        diseases.add(pneumonia);
//        We are setting the value of cancer as true under curable by creating the setter as we cannot access the privately modified member variable.
        cancer.setCurable(false);

//        for filtering all the diseases which are curable and non curable

        for (Disease disease:diseases) {
            if (disease.isCurable()){
                System.out.println(disease.getName() + " is a curable Disease.");
            }else{
                System.out.println(disease.getName()+ " requires Emergency Medical attention.");
            }

        }



    }
}
