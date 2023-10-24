import java.util.Scanner;

class Question {
    private String question;
    private String[] options;
    private char correctAnswer;

    public Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ". " + options[i]);
        }
    }
}

class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Create an array of Question objects
        Question[] questions = {
            // Group 1
            new Question("What is the capital of France?", new String[]{"London", "Berlin", "Paris", "Madrid"}, 'C'),
            new Question("Which planet is known as the 'Red Planet'?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 'B'),
            new Question("What is 7 x 8?", new String[]{"48", "56", "64", "72"}, 'B'),
            new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Charles Dickens", "Jane Austen", "William Shakespeare", "F. Scott Fitzgerald"}, 'C'),

            // Group 2
            new Question("What is the largest mammal in the world?", new String[]{"Elephant", "Giraffe", "Blue Whale", "Hippopotamus"}, 'C'),
            new Question("In which country is the Great Barrier Reef located?", new String[]{"Australia", "Brazil", "Thailand", "South Africa"}, 'A'),
            new Question("What gas do plants absorb from the atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 'B'),
            new Question("Who is known as the 'Father of Modern Physics'?", new String[]{"Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"}, 'A'),

            // Group 3
            new Question("What is the symbol for the element gold?", new String[]{"Go", "Gd", "Au", "Ag"}, 'C'),
            new Question("Which continent is the least populous?", new String[]{"Asia", "Europe", "Antarctica", "Australia"}, 'C'),
            new Question("What is the largest planet in our solar system?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 'C'),
            new Question("What is the primary function of the mitochondria?", new String[]{"Respiration", "Photosynthesis", "Digestion", "Excretion"}, 'A'),

            // Group 4
            new Question("What is the capital of Japan?", new String[]{"Seoul", "Beijing", "Tokyo", "Shanghai"}, 'C'),
            new Question("Who is the author of 'To Kill a Mockingbird'?", new String[]{"F. Scott Fitzgerald", "J.K. Rowling", "Harper Lee", "George Orwell"}, 'C'),
            new Question("Which gas do plants release during photosynthesis?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 'A'),
            new Question("Who painted the Mona Lisa?", new String[]{"Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh", "Claude Monet"}, 'B')
        };

        for (Question question : questions) {
            question.displayQuestion();
            char userAnswer = scanner.next().charAt(0);

            if (question.isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is " + question.isCorrectAnswer(' ') + "\n");
            }
        }

        System.out.println("Your final score is " + score + "/" + questions.length);
    }
}