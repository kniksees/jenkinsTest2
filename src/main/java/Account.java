public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }




    public boolean checkNameToEmboss() {
        if (name.length() <= 19 && name.length() >= 3){
            if ((name.toCharArray()[0] == ' ') || (name.toCharArray()[name.length()-1] == ' ')) {
                return false;
            } else {
                int countOfSpace = 0;
                for (int i = 0; i < name.length(); i++){
                    if (name.toCharArray()[i] == ' '){
                        countOfSpace++;
                    }
                }
                if (countOfSpace == 1){
                    return true;
                } else {
                    return false;
                }
            }

        } else {
            return false;
        }
    }

}
