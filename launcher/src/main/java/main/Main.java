package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static main.MkAssert.*;

public class Main {
    public static void main(String[] args) {
        // check argument input.
        System.out.print("test " + args[0]);
        if (args.length != 1)
        {
            System.err.print("please enter single file's name as argument\n");
            System.exit(1);
        }

        MK_ASSERT_DEV("김민규", (args[0] != null), "args[0]이 null입니다. 입력값을 확인해주세요.");
        try
        {
            File inputScenario = new File(args[0]);
//            Path inputPath = Paths.get(args[0]);
            Scanner fileScanner = new Scanner(inputScenario);

            String line;
            while ( fileScanner.hasNext() == true )
            {
                line = fileScanner.nextLine();
                System.out.print('\n' + line);
            }
        }
        catch (FileNotFoundException err)
        {
            System.err.print(err.getMessage() + '\n');
            System.exit(1);
        }
    }
}