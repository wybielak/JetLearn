package com.example.jetlearn

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetlearn.ui.theme.JetLearnTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message->
            MessageCard(msg = message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    JetLearnTheme {
        Conversation(SampleData.conversationSample)
    }
}