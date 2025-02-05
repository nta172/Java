public class Exercise4_8 {
    public static void main(String[] args) {
        /* In ra tất cả các group có chứa chữ Java */
        String[] groupNames = {"Java Developers", "Các qua môn gia va", "Học Java có khó không?"};
        for (String groupName : groupNames){
            if (groupName.contains("Java")) {
                System.out.println(groupName);
            }
        }
    }
}
