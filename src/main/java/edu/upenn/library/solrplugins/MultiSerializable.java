package edu.upenn.library.solrplugins;

import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.CharsRef;
import org.apache.lucene.util.CharsRefBuilder;

/**
 *
 * @author michael
 */
public interface MultiSerializable {

  CharsRef readableToDisplay(CharsRef input);

  String readableToDisplay(String input);

  CharsRef readableToSerialized(CharsRef input);

  String readableToSerialized(String input);

  CharsRef indexedToNormalized(BytesRef input, CharsRefBuilder output);

  String indexedToNormalized(String indexedForm);
}