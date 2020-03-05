package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A videogame
 */
public class VideogameResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse displayName;
	private final ListResponse<ImageResponse> images;
	private final StringResponse name;
	private final StringResponse slug;

	public VideogameResponse() {
		super(EntityType.VIDEOGAME);

		id = null;
		displayName = null;
		images = null;
		name = null;
		slug = null;
	}

	public VideogameResponse(IDResponse id, StringResponse displayName, ListResponse<ImageResponse> images, StringResponse name, StringResponse slug) {
		super(EntityType.VIDEOGAME, true);
		this.id = id;
		this.displayName = displayName;
		this.images = images;
		this.name = name;
		this.slug = slug;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getDisplayName() {
		checkProvided();
		return displayName;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}
}
