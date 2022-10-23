public class Author {
    public Author(String fullName) {
        String[] arr = fullName.split(" ");
        this.firstName = arr[0];
        this.lastName = arr[1];
        this.patronymic = arr[2];
    }

    String firstName;
    String lastName;
    String patronymic;

}