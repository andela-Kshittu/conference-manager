package com.binance.api.utils;

import com.binance.api.models.Talk;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static com.binance.api.TestUtils.exampleInputStream;
import static org.assertj.core.api.Assertions.assertThat;

public class CsvReaderTest {

    @Test
    public void testReadCsvFile() {
        InputStream inputStream = exampleInputStream();

        List<Talk> talkList = CsvReader.readCsvFile(inputStream);
        Talk talk = talkList.get(0);

        assertThat(talk.getMinutes()).isEqualTo(45);
        assertThat(talk.getTitle()).isEqualTo("Overdoing it in Python");
        assertThat(talkList.size()).isEqualTo(18);
    }
}
