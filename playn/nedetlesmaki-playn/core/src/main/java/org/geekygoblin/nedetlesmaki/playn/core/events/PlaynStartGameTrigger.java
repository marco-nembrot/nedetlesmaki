/*
 The MIT License (MIT)

 Copyright (c) 2014 devnewton <devnewton@bci.im>

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
package org.geekygoblin.nedetlesmaki.playn.core.events;

import org.geekygoblin.nedetlesmaki.core.AbstractStartGameTrigger;
import com.artemis.Entity;
import im.bci.tmxloader.TmxTileInstance;
import java.util.Random;
import im.bci.jnuit.animation.IAnimationCollection;
import org.geekygoblin.nedetlesmaki.core.NedGame;
import org.geekygoblin.nedetlesmaki.core.IAssets;
import org.geekygoblin.nedetlesmaki.core.NamedEntities;
import org.geekygoblin.nedetlesmaki.core.manager.EntityIndexManager;

/**
 *
 * @author devnewton natir
 */
public class PlaynStartGameTrigger extends AbstractStartGameTrigger {

    public PlaynStartGameTrigger(IAssets assets, @NamedEntities.MainMenu Entity mainMenu, @NamedEntities.IngameControls Entity ingameControls, EntityIndexManager indexSystem, Random random) {
        super(assets, mainMenu, ingameControls, indexSystem, random);
    }

    @Override
    protected void loadMap() {
        //TODO
    }

    @Override
    protected IAnimationCollection getTileAnimationCollection(TmxTileInstance tile) {
        //TODO
        return null;
    }

    @Override
    protected void createProjector(NedGame game) {
        final float tileWidth = map.getTilewidth();
        final float tileHeight = map.getTileheight();
        //TODO game.getSystem(DrawSystem.class).setSpriteProjector(new IsometricSpriteProjector(tileWidth, tileHeight));
    }

}
