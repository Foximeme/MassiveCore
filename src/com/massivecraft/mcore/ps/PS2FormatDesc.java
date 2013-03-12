package com.massivecraft.mcore.ps;

import com.massivecraft.mcore.util.Txt;

public class PS2FormatDesc extends PS2FormatAbstract
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static PS2FormatDesc i = new PS2FormatDesc();
	public static PS2FormatDesc get()	{ return i; }
	private PS2FormatDesc()
	{
		super(
			Txt.parse("<silver><em>NULL"),
			"",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_WORLD + Txt.parse(" <v>") + "%s",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_BLOCKX + Txt.parse(" <v>") + "%d",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_BLOCKY + Txt.parse(" <v>") + "%d",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_BLOCKZ + Txt.parse(" <v>") + "%d",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_LOCATIONX + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_LOCATIONY + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_LOCATIONZ + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_CHUNKX + Txt.parse(" <v>") + "%d",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_CHUNKZ + Txt.parse(" <v>") + "%d",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_PITCH + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_YAW + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_VELOCITYX + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_VELOCITYY + Txt.parse(" <v>") + "%.2f",
			Txt.parse("<k>") + PS2.NAME_SERIALIZED_VELOCITYZ + Txt.parse(" <v>") + "%.2f",
			" ",
			""
		);
	}
}