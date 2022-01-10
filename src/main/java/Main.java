
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Base[] base = {new Base(), new Base(), new Base()};
        Driver[] base2 = {new Driver(), new Driver(), new Driver()};
        String data1 = new String(Files.readAllBytes(Path.of("AutoBase.json")));
        String data2 = new String(Files.readAllBytes(Path.of("DriverInfo.json")));
        JSONArray json = new JSONArray(data1);
        JSONArray json2 = new JSONArray(data2);
        for (int i = 0; i < base.length; i++) {
            JSONObject js = json.getJSONObject(i);
            base[i].setId(js.getInt("id"));
            base[i].setDriver(js.getString("driver"));
            base[i].setName(js.getString("name"));
            base[i].setState(js.getString("state"));
        }
        for (int i = 0; i < base.length; i++) {
            JSONObject js = json2.getJSONObject(i);
            base2[i].setId(js.getInt("id"));
            base2[i].setName(js.getString("name"));
            base2[i].setBus("");
        }
        System.out.println();
        System.out.println("| # | Bus           | Driver | State |");
        System.out.println("+———+———————————————+————————+———————+");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|%-3s", base[i].getId());
            System.out.printf("|%-15s", base[i].getName());
            System.out.printf("|%-8s", base[i].getDriver());
            System.out.printf("|%-6s", base[i].getState());
            System.out.println();
        }
        System.out.println("\n====================================\n");
        System.out.print("Choose the truck: ");
        int a = scanner.nextInt();
        a--;
        while (true) {
            System.out.println(
                    "id        :      " + base[a].getId() +
                            "\nBus       :      " + base[a].getName() +
                            "\nDriver    :      " +
                            "\nState     :      " + base[a].getState());
            System.out.println("press 1 to change driver ");
            System.out.println("press 2 to send to the route ");
            System.out.println("press 3 to sent to the repairing ");
            break;
        }
        int b = scanner.nextInt();
        changeDriver(base,base2,a);
    }


            public static void changeDriver(Base[] base ,Driver[] base2,int a){
                while (true) {
                    System.out.println("-------------------------------");
                    System.out.println("driver changed successfully ");
                    System.out.println("");
                    System.out.println("-------------drivers-------------");
                    for (int i = 0; i < base.length; i++) {
                        System.out.printf("|%-3s", base2[i].getId());
                        System.out.printf("|%-3s", base2[i].getId());
                        System.out.printf("|%-15s", base2[i].getName());
                        if (base[i].getName() == base[a].getName()) {
                                System.out.printf("|%-15s", base[a].getName());
                                System.out.println();
                        }else {
                            System.out.println("");
                        }
                    }
                    System.out.println();
                    System.out.println("| # | Bus           | Driver | State |");
                    System.out.println("+———+———————————————+————————+———————+");
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("|%-3s", base[i].getId());
                        System.out.printf("|%-15s", base[i].getName());
                            if (base[a].getId() == base2[i].getId()) {
                                System.out.printf("|%-8s", base2[a].getName());
                            } else {
                                System.out.printf("|%-8s"," ");
                                System.out.print("");
                            }
                        System.out.printf("|%-6s", base[i].getState());
                        System.out.println();
                    }
                    break;
                }
            }
            public static void startDriving(Base[] bases ,Driver[] drivers,int id){

            }
            public static void startRepair(Base[] bases ,Driver[] drivers,int id){

            }
        }

