/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import java.util.Scanner;

/**
 *
 * @author faster
 */
public class Turingmachine {

    public static boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    public static boolean isNumber(int input) {
        return true;
    }

   
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter number of state:");
            int no_of_states = sc.nextInt();
            System.out.print("Enter number of string alphabet:");
            int alphabet = sc.nextInt();

            String[] Alphabet = new String[alphabet];
            for (int i = 0; i <= alphabet - 1; i++) {
                System.out.print( i+" :");
                Alphabet[i] = sc.next();
            }

            System.out.print("Enter number of machine alphabet: ");
            int no_machine_alphabet = sc.nextInt();
            String[] Machine_Alphabet = new String[no_machine_alphabet];
            for (int i = 0; i <= no_machine_alphabet - 1; i++) {
                System.out.print( i+" :");
                Machine_Alphabet[i] = sc.next();
            }

            int no_of_Transitions = no_of_states * (alphabet + no_machine_alphabet);

            char[][] Transition = new char[no_of_Transitions][5]; 
            System.out.print("Enter your Transition:  ");
            for (int i = 0; i < Transition.length; i++) {
                String s=sc.next();
                for (int j = 0; j < Transition[0].length; j++) {
                    Transition[i][j] =s.charAt(j);
                }
            }

            System.out.print("Enter your string :  ");
            String str = sc.next();
            char[] Tape = new char[70];

            for (int i = 0; i < str.length(); i++) {
                Tape[i] = str.charAt(i);
            }

            System.out.print("Enter intial position of the head :  ");
            int head = sc.nextInt();

            char x = '0';
            boolean flag = false;
            boolean f=true;

            for (int k = 0; k < 50; k++) {
                for (int i = 0; i < Transition.length; i++) {
                    for (int j = 0; j < Transition[0].length; j++) {
                        if (Transition[i][0] == (x) && Transition[i][1] == Tape[head]) {
                            x = Transition[i][2];
                            Tape[head] = Transition[i][3];

                            if (Transition[i][4] == 'R') {
                                head++;
                            } else if (Transition[i][4] == 'L') {
                                head--;
                            } else if (Transition[i][4] == 'Y') {
                                System.out.println("your string is accepted");
                                flag = true;
                                break;
                            } else if (Transition[i][4] == 'N') {
                                System.out.println("your string is rejected");
                                System.exit(0);
                            } else {
                                System.out.print("something is wrong");
                            }
                        }
                    }
                    if (flag == true) {
                        break;
                    }

                    if (flag == true) {
                        break;
                    }
                }
            }

            System.out.print("the final string is: ");
            for (int i = 0; i < Tape.length; i++) {
                System.out.print(Tape[i]);
            }
            System.out.println("");
            System.out.println("the final position of the head is : "+head);
        } catch (Exception e) {
            System.out.println("their is a problem: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

}
