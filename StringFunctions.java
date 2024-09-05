/***
        *   Question: All the basic string assingment
        *   Owner name: Dikshant Goswami
        *   brief explaination:- enter instruction according to code and get the desire operation for every instruction you get an
 *                               different operations
        *   Date: 5-9-2024
        */


import java.util.Scanner;

class StringMethods
{
    static String s = "";

    public void append()
    {
        System.out.println("Enter the string:- ");
        Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();
            s = s + inp + " ";
            System.out.println(s);

    }

    public void countWord()
    {
        System.out.println("Enter the string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println("Word count: " + count);
    }

    public boolean isPalindrome(String name)
    {
        int length = name.length();
        name = name.toLowerCase(); // Convert to lowercase manually
        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (name.charAt(i) != name.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static int maximum(int i, int j)
    {
        return (i > j) ? i : j;
    }

    public void maxFrequency()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word & get the most repeated character: ");
        String name = scanner.nextLine();

        int mx = 0;
        char maxChar = '\0';

        for (int i = 0; i < name.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j))
                {
                    count++;
                }
            }
            if (count > mx)
            {
                mx = count;
                maxChar = name.charAt(i);
            }
        }

        if (mx > 1)
        {
            System.out.println(maxChar + " -> " + mx);
        } else
        {
            System.out.println("No repeated characters found.");
        }
    }

    public void replace(String string, char oldCharacter, char newCharacter)
    {
        String output = string.replace(oldCharacter, newCharacter);
        System.out.println("Replaced string: " + output);
    }

    public void toReverseString(char[] name, int length)
    {
        for (int i = length - 1, j = 0; i > j; i--, j++)
        {
            char temp = name[i];
            name[i] = name[j];
            name[j] = temp;
        }
        System.out.println("Reversed string: " + new String(name));
    }

    public void toSortAlphabets(char[] name, int len)
    {
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (name[i] > name[j])
                {
                    char temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("Sorted string: " + new String(name));
    }

    public void Split()
    {
        System.out.println("Enter the string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (String word : arr)
        {
            System.out.println(word);
        }
    }

    public void Splice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:- ");
        String s = sc.nextLine();
        System.out.println("enter the start:- ");
        int a = sc.nextInt();
        System.out.println("enter the end:- ");
        int b = sc.nextInt();
        String out="";
        for(int i=0;i<s.length();i++){
            if(a<0 || b>s.length()){
                System.out.println("invalid index");
                break;
            }
            if(i>=a && i<=b-1+a ) continue;
            else out=out+s.charAt(i);
        }
        System.out.println(out);
    }

    public static void toReverse(char[] name, int start, int end)
    {
        while (start < end)
        {
            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;
            start++;
            end--;
        }
    }

    public static void toShift(char[] name, int length)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits you want to shift: ");
        int shift = scanner.nextInt();

        if (shift > length)
        {
            System.out.println("The shift value is greater than the length.");
            return;
        }

        toReverse(name, 0, shift - 1);
        toReverse(name, shift, length - 1);
        toReverse(name, 0, length - 1);

        System.out.println("Shifted string: " + new String(name));
    }
}

public class StringFunctions
{
    public static void main(String[] args)
    {
        StringMethods stringMethods = new StringMethods();
        Scanner sc = new Scanner(System.in);
        String str = "";

        boolean continueProgram = true;

        while (continueProgram)
        {
            System.out.println("Enter a string operation:");
            System.out.println("1) Append a string");
            System.out.println("2) Split a string");
            System.out.println("3) Replace a string");
            System.out.println("4) Splice");
            System.out.println("5) Reverse a string");
            System.out.println("6) Shift characters");
            System.out.println("7) Sort characters");
            System.out.println("8) Count words");
            System.out.println("9) Check palindrome");
            System.out.println("10) Max frequency character");

            if(!sc.hasNextInt())
            {
                System.out.println("Please enter an integer from 1 to 10 only");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice)
            {
                case 1:
                    stringMethods.append();
                    break;
                case 2:
                    stringMethods.Split();
                    break;
                case 3:
                    System.out.println("Enter the string:");
                    str = sc.nextLine();
                    System.out.println("Enter the character to replace:");
                    char oldChar = sc.next().charAt(0);
                    System.out.println("Enter the new character:");
                    char newChar = sc.next().charAt(0);
                    stringMethods.replace(str, oldChar, newChar);
                    break;
                case 4:
                    stringMethods.Splice();
                    break;
                case 5:
                    System.out.println("Enter the string to reverse:");
                    str = sc.nextLine();
                    stringMethods.toReverseString(str.toCharArray(), str.length());
                    break;
                case 6:
                    System.out.println("Enter the string:");
                    str = sc.nextLine();
                    stringMethods.toShift(str.toCharArray(), str.length());
                    break;
                case 7:
                    System.out.println("Enter the string:");
                    str = sc.nextLine();
                    stringMethods.toSortAlphabets(str.toCharArray(), str.length());
                    break;
                case 8:
                    stringMethods.countWord();
                    break;
                case 9:
                    System.out.println("Enter the string to check palindrome:");
                    str = sc.nextLine();
                    boolean isPalindrome = stringMethods.isPalindrome(str);
                    System.out.println("Is palindrome: " + isPalindrome);
                    break;
                case 10:
                    stringMethods.maxFrequency();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            // Asking the user whether they want to continue or exit
            System.out.println("Do you want to exit? (yes/no): ");
            String exitChoice = sc.next().toLowerCase();

            if (exitChoice.equals("yes") || exitChoice.equals("y"))
            {
                continueProgram = false;
            }
        }

        sc.close();
    }
}
