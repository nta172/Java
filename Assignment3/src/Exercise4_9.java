public class Exercise4_9 {
    public static void main(String[] args) {
        /*In ra tất cả các group "Java" */
        String[] groupNames = {"C#", "Python", "Java", "Ruby"};
        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
               System.out.println(groupName); 
            }
        }
    }
}
