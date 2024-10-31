// Create Interface and implement it via abstract class
//
//-> Create Phone Interface, it should have call, text, showCallHistory and showTextHistory functions.
//-> Create SimplePhone abstract classes and implement those functions. When you use call function it should ask who you want to call then should store it, if you text it should ask your text message and who you text with.
//
//-> Create YourNamePhone(HuseyinPhone) and inherit the SimplePhone and test your codes.
//
//NOTE: You can add related information or some necessary information to your classes.
public class Phone {
    public void call(String toWho) {
        System.out.println("Calling " + toWho);
    }

    public void text(String toWho, String message) {
        System.out.println("Texting " + toWho + " with message: " + message);
    }

    public void showCallHistory() {
        System.out.println("Call History:");
        // Showing call history
    }

    public void showTextHistory() {
        System.out.println("Text History:");
        // Showing text history
    }

    public static class HuseyinPhone extends Phone.SimplePhone {
        public static void main(String[] args) {
            HuseyinPhone huseyinPhone = new HuseyinPhone();
            huseyinPhone.call("John Doe");
            huseyinPhone.text("Jane Smith", "Hello, How are you?");
            huseyinPhone.showCallHistory();
            huseyinPhone.showTextHistory();
        }
    }

    // Implementing SimplePhone abstract classes
    public static abstract class SimplePhone extends Phone {
        @Override
        public void call(String toWho) {
            System.out.println("Calling " + toWho + " using SimplePhone");
        }

        @Override
        public void text(String toWho, String message) {
            System.out.println("Texting " + toWho + " with message: " + message + " using SimplePhone");
        }

        @Override
        public void showCallHistory() {
            System.out.println("Call History (SimplePhone):");
            // Showing call history
        }

        @Override
        public void showTextHistory() {
            System.out.println("Text History (SimplePhone):");
            // Showing text history
        }


    }
}
