package sk.uniza.fri.mapa.nehybneObjekty.upgrades;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import sk.uniza.fri.hra.Hrac;
import sk.uniza.fri.mapa.ObjektNaMape;

public class DosahBombyUpgrade extends ObjektNaMape implements IUpgrade {
    public DosahBombyUpgrade(int x, int y, String nazovSuboru, SpriteBatch batch) {
        super(x, y, nazovSuboru, batch);
    }

    @Override
    public boolean zober(Hrac hrac) {
        return false;
    }
}
