package queens;

/**
 *
 * @author chung
 */
public class ChessPlate {

    public static boolean isOk(Coord[] Q) {
        boolean foundError = false;

        for (int k = 0; k < 8; k++) {
            for (int j = 0; j < 8; j++) {

                if (((Q[k].x == Q[j].x)
                        || (Q[k].y == Q[j].y)
                        || (Q[k].diag() == Q[j].diag())
                        || (Q[k].adiag() == Q[j].adiag()))&&(k!=j) ) {
                    foundError = true;
                }
            }
        }
        return !foundError;
    }

    
}
