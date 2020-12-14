/* 
 * Copyright 2020 Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pablo Claramunt Hernandis - pablo.claramunt.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {

        //Título
        System.out.println("Análisis de edad");

        //Separador
        System.out.println("================");

        //Fecha Sistema
        LocalDate today = LocalDate.now();
        int aa = CAL.get(Calendar.YEAR);
        int ma = today.getMonthValue();
        int da = CAL.get(Calendar.DAY_OF_MONTH);

        //Entrada dia de nacimiento
        int dNac = 0;
        try {
            System.out.print("Día nacimiento ....: ");
            dNac = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR: Entrada Incorrecta");
            System.exit(0);
        } finally {
            SCN.nextLine();
        }

        //Entrada mes nacimiento
        int mNac = 0;
        try {
            System.out.print("Mes nacimiento ....: ");
            mNac = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR: Entrada Incorrecta");
            System.exit(0);
        } finally {
            SCN.nextLine();
        }

        //Entrada año de nacimiento
        int aNac = 0;
        try {
            System.out.print("Año nacimiento ....: ");
            aNac = SCN.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR: Entrada Incorrecta");
            System.exit(0);
        } finally {
            SCN.nextLine();
        }

        //Separador
        System.out.println("---");

        System.out.printf("Fecha nacimiento ..: %02d/%02d/%02d%n", dNac, mNac,
                aNac);
        System.out.printf("Fecha actual ......: %02d/%02d/%02d%n",
                da, ma, aa);

        //Separador
        System.out.println("---");

        //Mayoría de edad
        System.out.printf("Mayoría de edad ...: %s%n",
                aa - aNac >= 18 && ma >= mNac && da > dNac
                        ? "SI"
                        : "NO");

    }
}
