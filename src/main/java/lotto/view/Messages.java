package lotto.view;

public enum Messages {
    ASK_PURCHASE_AMOUNT_MESSAGE("구입금액을 입력해 주세요."),
    PURCHASE_SUCCESS("%d개를 구매했습니다."),
    ASK_WINNING_NUMBERS_MESSAGE("당첨 번호를 입력해 주세요."),
    ASK_BONUS_NUMBER_MESSAGE("보너스 번호를 입력해주세요.");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCountMessage(int count) {
        return String.format(message, count);
    }
}
