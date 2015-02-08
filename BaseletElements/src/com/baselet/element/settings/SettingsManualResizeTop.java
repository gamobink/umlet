package com.baselet.element.settings;

import java.util.List;

import com.baselet.element.facet.ElementStyleEnum;
import com.baselet.element.facet.Facet;
import com.baselet.element.facet.Settings;

public abstract class SettingsManualResizeTop extends Settings {

	@Override
	public ElementStyleEnum getElementStyle() {
		return ElementStyleEnum.SIMPLE;
	}

	@Override
	protected List<Facet> createFacets() {
		return Settings.MANUALRESIZE;
	}
}