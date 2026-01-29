public class Tester {
    public static void main(String[] args) {
        Assignment chemLab = new Assignment("Chem Lab", "do it + submit");
        testNull(chemLab);
        checkAssignment(chemLab); 
        testBrainRot(chemLab);
        checkAssignment(chemLab);
        testProfanity(chemLab);
        checkAssignment(chemLab);
    }

    public static void checkAssignment(Assignment assignment) {
        System.out.println(assignment.getTitle());
        System.out.println(assignment.getDescription());
        System.out.println(assignment.getDescriptionLength());
    }

    public static void testNull(Assignment assignment) {
        try{
            assignment.setTitle(null);
            assignment.setDescription(null);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void testProfanity(Assignment assignment) {
        try{
            assignment.setTitle("Frick");
            //assignment.setDescription("Poop");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void testBrainRot(Assignment assignment) {
        try{
            //assignment.setTitle("TungTungTungSahur");
            assignment.setDescription("5 Netherite Ingots");
            //assignment.setTitle("9+10");
            //assignment.setDescription("Quandale Dingle");
        } catch(Exception e) {
            System.out.println(e);
        }
    }


}
