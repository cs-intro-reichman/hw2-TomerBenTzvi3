public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(("" + args[0].charAt(0) + args[0].charAt(1)));
        int minutes = Integer.parseInt(("" + args[0].charAt(3) + args[0].charAt(4)));
        int minutestoadd = Integer.parseInt(args[1]);
        int Totalminutes = (hours * 60) + minutes + minutestoadd;
        int Totalhours = Totalminutes / 60;
        int Newhours = Totalhours % 24;
        int Newminutes = Totalminutes - (Totalhours * 60);
        if (Newhours == 0 && Newminutes < 10) {
            System.out.println(Newhours + "0" + ":" + "0" + Newminutes);
        } else if (Newhours < 24 && Newhours > 10 && Newminutes == 0 || Newminutes < 10) {
            System.out.println(Newhours + ":" + "0" + Newminutes);
        } else if (Newhours == 0 && Newminutes > 10) {
            System.out.println(Newhours + "0" + ":" + Newminutes);
        } else if (Newhours < 10 && Newminutes < 10) {
            System.out.println( "0" + Newhours + ":" + "0" + Newminutes);
        } else {
            System.out.println(Newhours + ":" + Newminutes);
        }
    }
}
