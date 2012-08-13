/*
 * Copyright (C) 2012 Julien Dramaix
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.watopi.chosen.client.event;


import com.google.gwt.event.shared.EventHandler;

import com.watopi.chosen.client.ChosenImpl;

public class ReadyEvent extends ChosenEvent<ReadyEvent.ReadyHandler> {

	public static Type<ReadyHandler> TYPE = new Type<ReadyHandler>();

	public interface ReadyHandler extends EventHandler {
		void onReady(ReadyEvent event);
	}

	public ReadyEvent(ChosenImpl chosen) {
		super(chosen);
	}

	@Override
	protected void dispatch(ReadyHandler handler) {
		handler.onReady(this);
	}

	@Override
	public Type<ReadyHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<ReadyHandler> getType() {
		return TYPE;
	}

}