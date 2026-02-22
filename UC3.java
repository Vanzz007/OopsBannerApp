/*THIS IS A PROGRAM WHERE WE PRINT OOPS USING THE STRING.JOIN FUNCTION*/
public class UC3 {

    public static void main(String[] args) {

        String banner = String.join("\n",
                "   ***        ***      ******       *****",
                            " **    **   **    **   **    **   **",
                            "**      ** **      **  **     ** **",
                            "**      ** **      **  **    **   **",
                            "**      ** **      **  ******       ***",
                            "**      ** **      **  **              **",
                            " **    **   **    **   **             **",
                            "   ***   **   ***      **         *****"
                        
       );

        System.out.println(banner);
    }
}