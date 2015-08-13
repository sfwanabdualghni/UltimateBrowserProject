package io.github.UltimateBrowserProjectBeta.Browser;

import android.os.Handler;
import android.os.Message;
import io.github.UltimateBrowserProjectBeta.View.UltimateBrowserProjectWebView;

public class UltimateBrowserProjectClickHandler extends Handler {
    private UltimateBrowserProjectWebView webView;

    public UltimateBrowserProjectClickHandler(UltimateBrowserProjectWebView webView) {
        super();
        this.webView = webView;
    }

    @Override
    public void handleMessage(Message message) {
        super.handleMessage(message);
        webView.getBrowserController().onLongPress(message.getData().getString("url"));
    }
}
