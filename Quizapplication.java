import java.util.Scanner;
public class Quizapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of India?",
            "Who is the CEO of Tesla?",
            "What is the largest planet in our solar system?"
        };

        String[] options = {
            "New Delhi, Mumbai, Chennai, Kolkata",
            "Elon Musk, Jeff Bezos, Bill Gates, Mark Zuckerberg",
            "Earth, Saturn, Jupiter, Uranus"
        };

        String[] answers = {
            "New Delhi",
            "Elon Musk",
            "Jupiter"
        };

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("Options: " + options[i]);
            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct answer!\n");
                score++;
            } else {
                System.out.println("Incorrect answer. The correct answer is " + answers[i] + ".\n");
            }
        }
        System.out.println("Quiz completed! Your final score is " + score + " out of " + questions.length + ".");
    }
}

