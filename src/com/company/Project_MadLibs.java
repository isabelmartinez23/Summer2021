package com.company;
import java.util.Scanner;

public class Project_MadLibs {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        System.out.print("Type any noun: ");
        String noun1 = input.nextLine();
        System.out.print("Type any state: ");
        String state1 = input.nextLine();
        System.out.print("Type any verb: ");
        String verb1 = input.nextLine();
        System.out.print("Type any noun: ");
        String noun2 = input.nextLine();
        System.out.print("Type any first name: ");
        String name1 = input.nextLine();
        System.out.print("Type any verb ending in -ed: ");
        String verb2 = input.nextLine();
        System.out.print("Type any noun: ");
        String noun3 = input.nextLine();
        System.out.print("Type any verb: ");
        String verb3 = input.nextLine();
        System.out.print("Type any noun: ");
        String noun4 = input.nextLine();
        System.out.print("Type any body part: ");
        String bodyPart1 = input.nextLine();
        System.out.print("Type any adjective: ");
        String adjective1 = input.nextLine();
        System.out.print("Type any type of relative: ");
        String relative1 = input.nextLine();
        System.out.print("Type any activity: ");
        String activity1 = input.nextLine();
        System.out.print("Type any chain restaurant: ");
        String restaurant1 = input.nextLine();
        System.out.print("Type any adjective, past tense: ");
        String adjective2 = input.nextLine();
        System.out.print("Type any month: ");
        String month1 = input.nextLine();
        System.out.print("Type any verb: ");
        String verb4 = input.nextLine();
        System.out.print("Type any noun: ");
        String noun5 = input.nextLine();
        System.out.print("Type any verb, past tense: ");
        String verb5 = input.nextLine();
        System.out.print("Type any adjective: ");
        String adjective3 = input.nextLine();
        System.out.print("Type any verb: ");
        String verb6 = input.nextLine();
        System.out.print("Type any plural noun: ");
        String noun6 = input.nextLine();

        System.out.println("A " + noun1 + "in " + state1 + " was arrested this morning after he " + verb1
        + " in front of " + noun2 + ". " + name1 + " had a history of " + verb2 + ", but no one, not even his " +
        noun3 + " ever imagined he'd " + verb3 + " with a " + noun4 + " stuck in his " + bodyPart1 +
                ". I always thought he was " + adjective1 + ", but I never thought he'd do something like this. " +
                "Even his " + relative1 + " was surprised. After a brief " + activity1 + ", cops followed him " +
                "to a " + restaurant1 + ", where he reportedly " + adjective2 + " in the fry machine. " +
                "In " + month1 + ", a woman was charged with a similar crime. But rather than " +
                verb4 + ", she " + verb5 + " with a " + adjective3 + " dog. " + "Either way, we imagine" +
                " that after witnessing him " + verb6 + " with a " + noun5 + " there will be a lot of " +
                noun6 + " that are going to need some therapy");

    }
}
