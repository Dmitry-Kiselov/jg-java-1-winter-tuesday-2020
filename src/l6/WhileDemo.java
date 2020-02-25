package l6;

public class WhileDemo {

    public static void main(String[] args) {

        int pagesCount = 350;
        int currentPage = 10;

        while (currentPage < pagesCount) {
            System.out.println("Such page " + currentPage + ".. Much book.. Wow.. ");
            currentPage++;

            if (currentPage == 27) {
                System.out.println("This chapter is very bad. Not gonna read it and skip 14 pages");
                currentPage += 14;
            }
        }

    }

}
