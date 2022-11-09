package samples_20_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TrafficLight {
    private int p;
    void setValue(int t) {
        if (t > 10) {
            p = t % 10;
        } else if (t <= 10) {
            p = t;
        }
    }
    int getValue() {
        return p;
    }
}

class TestTrafficLights {
    public static void main(String[] args) throws IOException {
        TrafficLight k = new TrafficLight();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value");
        int t = Integer.parseInt(br.readLine());
        k.setValue(t);
        //green =3;
        //red =2;

        int p = k.getValue();

        if (0 <= p && p <= 3 || 6 <= p && p <= 8) {
            System.out.print("Green");
        }
        if (4 <= p && p <= 5 || 9 <= p && p <= 10) {
            System.out.print("Red");
        }
    }
}