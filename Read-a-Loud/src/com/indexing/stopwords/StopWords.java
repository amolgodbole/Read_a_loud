/**
 * 
 */
package com.indexing.stopwords;

import java.io.File;

/**
 * @author amol
 *
 */
public interface StopWords {

	boolean contains(String word);

	void init(File swf) throws Exception;

}


