package com.tickcounter;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.Color;

@ConfigGroup("tickcounter")
public interface TickCounterConfig extends Config
{
	@ConfigItem(
		keyName = "resetInstance",
		name = "Reset on new instances",
		description = "",
		position = 1
	)
	default boolean instance()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "titleColor",
			name = "Title color",
			description = "",
			position = 2
	)
	default Color titleColor()
	{
		return Color.GREEN;
	}

	@Alpha
	@ConfigItem(
		keyName = "selfColor",
		name = "Your color",
		description = "",
		position = 3
	)
	default Color selfColor()
	{
		return Color.CYAN;
	}

	@Alpha
	@ConfigItem(
			keyName = "otherColor",
			name = "Other players color",
			description = "",
			position = 4
	)
	default Color otherColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		keyName = "totalEnabled",
		name = "Show total ticks",
		description = "",
		position = 5
	)
	default boolean totalEnabled()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		keyName = "totalColor",
		name = "Total color",
		description = "",
		position = 6
	)
	default Color totalColor()
	{
		return Color.RED;
	}

	@ConfigItem(
		keyName = "showZamorakianSpear",
		name = "Include Zamorakian Spear",
		description = "",
		position = 7
	)
	default boolean showZamorakianSpear()
	{
		return true;
	}
}
