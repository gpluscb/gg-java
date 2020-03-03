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
	private final ListResponse<ImageResponse> images;
	private final StringResponse name;
	private final StringResponse slug;
	private final StringResponse displayName;

	public VideogameResponse() {
		super(EntityType.VIDEOGAME);

		id = null;
		images = null;
		name = null;
		slug = null;
		displayName = null;
	}

	public VideogameResponse(IDResponse id, ListResponse<ImageResponse> images, StringResponse name, StringResponse slug, StringResponse displayName) {
		super(EntityType.VIDEOGAME, true);
		this.id = id;
		this.images = images;
		this.name = name;
		this.slug = slug;
		this.displayName = displayName;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
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

	public StringResponse getDisplayName() {
		checkProvided();
		return displayName;
	}
}
