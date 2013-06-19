package com.git.tdgame.guiActor;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuButton extends Actor
{
	private final String playButtonFile = "data/menu/play.png";
	private final String playButtonFileClicked = "data/menu/playClicked.png";
	private final String optionsButtonFile = "data/menu/options.png";
	private final String optionsButtonFileClicked = "data/menu/optionsClicked.png";
	
	public enum ButtonType { PLAY, OPTIONS };
	
	private Texture texture;
	private Texture textureClicked;
	private Sprite sprite;
	private Sprite spriteClicked;
	private ButtonType type;
	private boolean isHovered;
	
	public MenuButton( ButtonType type, int x, int y ) {
		this.type = type;
		setX(x);
		setY(y);
		
		if(type == ButtonType.PLAY ) {
			texture = new Texture(Gdx.files.internal(playButtonFile));
			textureClicked = new Texture(Gdx.files.internal(playButtonFileClicked));
		} else if(type == ButtonType.OPTIONS) {
			texture = new Texture(Gdx.files.internal(optionsButtonFile));
			textureClicked = new Texture(Gdx.files.internal(optionsButtonFileClicked));
		}
		
		setHeight(texture.getHeight());
		setWidth(texture.getWidth());
        sprite = new Sprite(texture);
        spriteClicked = new Sprite(textureClicked);
	}
	
	@Override
	public void draw(SpriteBatch batch, float parentAlpha) {
		
		if(!isHovered)
		{
			batch.draw(sprite,getX(),getY(),getOriginX(),getOriginY(),getWidth(),getHeight(),1,1,0);
		} else {
			batch.draw(spriteClicked,getX(),getY(),getOriginX(),getOriginY(),getWidth(),getHeight(),1,1,0);
		}
		super.draw(batch, parentAlpha);
	}

	public ButtonType getType() {
		return type;
	}

	public void setHover(boolean b) {
		isHovered = b;
	}
}
