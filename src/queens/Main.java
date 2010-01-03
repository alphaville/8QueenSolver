package queens;

/**
 * 8Queen Solver - Provides one or all solutions to the 8Queen problem.
 * see 
 * @author Sopasakis Pantelis
 */
public class Main {

    /**
     * --> http://www.123games.com/8queens.html <--
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i1 = 1; i1 <= 8; i1++) {
            for (int i2 = 1; i2 <= 8; i2++) {
                for (int i3 = 1; i3 <= 8; i3++) {
                    for (int i4 = 1; i4 <= 8; i4++) {
                        for (int i5 = 1; i5 <= 8; i5++) {
                            for (int i6 = 1; i6 <= 8; i6++) {
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    for (int i8 = 1; i8 <= 8; i8++) {
                                        
                                        Coordinates[] Q = new Coordinates[8];

                                        Q[0] = new Coordinates(1, i1);
                                        Q[1] = new Coordinates(2, i2);
                                        Q[2] = new Coordinates(3, i3);
                                        Q[3] = new Coordinates(4, i4);
                                        Q[4] = new Coordinates(5, i5);
                                        Q[5] = new Coordinates(6, i6);
                                        Q[6] = new Coordinates(7, i7);
                                        Q[7] = new Coordinates(8, i8);

                                        if (Game.isOk(Q)) {
                                            System.out.println("Solution:");
                                            for (int k = 0; k < 8; k++) {
                                                System.out.println(Q[k].x + " -- " + Q[k].y);
                                            }
                                            System.exit(0);

                                        }



                                    }

                                }

                            }

                        }

                    }

                }
            }
        }

    }
}
