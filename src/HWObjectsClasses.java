public class HWObjectsClasses {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина", levTolstoy, 1878);
        System.out.println("Название книги - " + annaKarenina.getBookName());
        System.out.println("Автор книги - " + annaKarenina.getAuthor().getAuthorName() + " " + annaKarenina.getAuthor().getAuthorSurname());
        System.out.println("Первое книжное издание - " + annaKarenina.getPublicationYear());
        annaKarenina.setPublicationYear(1875);
        System.out.println("Год начала журнальной публикации - " + annaKarenina.getPublicationYear());
        System.out.println();
        Author danteAliguery = new Author("Данте", "Алигьери");
        Book theDivinComedy = new Book("Божественная комедия", danteAliguery, 1472);
        System.out.println("Название книги - " + theDivinComedy.getBookName());
        System.out.println("Автор книги - " + theDivinComedy.getAuthor().getAuthorName() + " " + theDivinComedy.getAuthor().getAuthorSurname());
        System.out.println("Первое книжное издание - " + theDivinComedy.getPublicationYear());
        theDivinComedy.setPublicationYear(1481);
        System.out.println("Год второго варианта издания - " + theDivinComedy.getPublicationYear());
    }
}
