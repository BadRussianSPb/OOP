import java.io.IOException;

import Models.Model;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void mainClick() {
        model.setA(view.getValue("Введите значение1_1"));
        model.setB(view.getValue("Введите значение1_2"));
        model.setM(view.getValue("Введите значение2_1"));
        model.setN(view.getValue("Введите значение2_2"));
        System.out.println();

        String result = model.result();
        try {
            Filework.LogToFile(model, result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        view.print("Ответ:", result);
    }
}
