package com.husky.events.commands.util;

import com.husky.events.commands.Command;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class PingCommand extends Command {

    public PingCommand() {
        super("ping", new String[]{"ping", "p"});
    }

    @Override
    public void executeCommand(Message message) {
            long time = System.currentTimeMillis();
            message.getChannel().sendMessage("Pong!").queue(response /* => Message */ -> {
                response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue();
            });

    }

}