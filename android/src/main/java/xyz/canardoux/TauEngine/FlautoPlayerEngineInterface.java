package xyz.canardoux.TauEngine;
/*
 * Copyright 2018, 2019, 2020, 2021 Canardoux.
 *Canardoux
 * This file is part of Flutter-Sound.
 *
 * Flutter-Sound is free software: you can redistribute it and/or modify
 * it under the terms of the Mozilla Public License version 2 (MPL2.0),
 * as published by the Mozilla organization.
 *
 * Flutter-Sound is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * MPL General Public License for more details.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import java.util.ArrayList;

abstract class FlautoPlayerEngineInterface
{
	abstract void _startPlayer(Flauto.t_CODEC codec, String path, int sampleRate, int numChannels, boolean interleaved, int bufferSize, boolean enableVoiceProcessing, FlautoPlayer theSession) throws Exception;
	abstract void _stop();
	abstract void _pausePlayer() throws Exception;
	abstract void _resumePlayer() throws Exception;
	abstract void _setVolume(double volume) throws Exception;
	abstract void _setVolumePan(double volume, double pan) throws Exception;
	abstract void _setSpeed(double speed) throws Exception;
	abstract void _seekTo(long millisec);
	abstract boolean _isPlaying();
	abstract long _getDuration();
	abstract long _getCurrentPosition();
	abstract int feed(byte[] data) throws Exception;
	abstract int feedInt16(ArrayList<byte[]> data) throws Exception;
	abstract int feedFloat32(ArrayList<float[]> data) throws Exception;
	abstract void _play();
}
