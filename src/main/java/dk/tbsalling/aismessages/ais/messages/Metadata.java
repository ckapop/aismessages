package dk.tbsalling.aismessages.ais.messages;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Metadata implements Serializable {

    public Metadata(String source) {
        this.source = source;
        this.received = System.currentTimeMillis();
    }

    public Metadata(String source, long received) {
        this.source = source;
        this.received = received;
    }

    @SuppressWarnings("unused")
	public String getSource() {
		return source;
	}

    public long getReceived() {
        return received;
    }

    @SuppressWarnings("unused")
	public String getCategory() {
		return category;
	}

    @SuppressWarnings("unused")
	public String getDecoderVersion() {
		return decoderVersion;
	}

    @Override
    public String toString() {
        return "Metadata{" +
                "source='" + source + '\'' +
                ", received=" + new Date(received) +
                '}';
    }

    // TODO Add decoder version from maven
	// TODO Add decode status and error descriptions
	private final static String decoderVersion = AISMessage.VERSION;
	private final static String category = "AIS";

	private final String source;
    private final long received;
}
