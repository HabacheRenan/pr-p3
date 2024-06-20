package controller;

public class metodos {
    public void lerMostrarJSON() {
        String json = "{\"items\":[{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090100\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1516},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090200\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1444},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090300\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1353},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090400\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1400},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090500\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1391},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090600\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1546},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090700\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":6934},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090800\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":11049},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021090900\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":3510},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091000\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":2300},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091100\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1713},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091200\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1798},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091300\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1494},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091400\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1489},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091500\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1521},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091600\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1599},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091700\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1471},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091800\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1681},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021091900\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1611},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092000\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1469},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092100\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1484},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092200\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1500},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092300\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":5759},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092400\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":5544},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092500\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":3265},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092600\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":3138},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092700\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":2579},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092800\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":2296},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021092900\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":2021},{\"project\":\"en.wikipedia\",\"article\":\"Tiger_King\",\"granularity\":\"daily\",\"timestamp\":\"2021093000\",\"access\":\"all-access\",\"agent\":\"all-agents\",\"views\":1987}]}";

        String itemsJson = json.substring(json.indexOf("[") + 1, json.lastIndexOf("]"));

        String[] items = itemsJson.split("\\},\\{");

        for (String item : items) {
            String timestamp = extractValue(item, "\"timestamp\":\"", "\"");
            if (timestamp != null && timestamp.length() >= 2) {
                timestamp = timestamp.substring(0, timestamp.length() - 2);
            }

            String views = extractValue(item, "\"views\":", "}");

            System.out.println("Timestamp: " + timestamp + ", Views: " + views);
        }
    }

    private static String extractValue(String item, String startDelimiter, String endDelimiter) {
        int startIndex = item.indexOf(startDelimiter);
        if (startIndex != -1) {
            startIndex += startDelimiter.length();
            int endIndex = item.indexOf(endDelimiter, startIndex);
            if (endIndex != -1) {
                return item.substring(startIndex, endIndex);
            }
        }
        return null;
    }
}
