package com.mathis.midiBase;


import android.media.midi.MidiDevice;

public interface hardwareMidiNativeSetup {

    /** Init the native tiers
     * This permits callback with natively received midi messages
     */
    void initNative();

    /**
     * Start midi reading thread in the native implementation
     * @param receiveDevice The selected midi receive device
     * @param portNumber Possiblity to set a specific port, by default, provide 0
     */
    void startReadingMidi(MidiDevice receiveDevice, int portNumber);
    /*
     * Stop the native midi reading thread
     */
    void stopReadingMidi();

    /** Set the receiver for retransmission of incoming midi messages
     *
     * @param receiver Class that should do the actual handling of the incoming midi messages
     */
    void setMessageReceiver(hardwareMidiNativeReceiver receiver);


}

