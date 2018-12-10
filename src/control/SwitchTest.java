package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * locate control
 * Created by MasterTj on 2018/12/10.
 */
public class SwitchTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while ((str=br.readLine())!=null){
            switch (Integer.valueOf(str)){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}
